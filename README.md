# examples-eurent

The contents of this repository demonstrate the execution of OCL invariants, derived attributes and model queries on the basis of the EU-rent car rentals specification.
This repository has three subprojects, i.e., **emf-ocl-interpreter**, **emf-ocl-java**, **crossecore-java**
Each project contains source code generated from the same Ecore model. 
However, the way how OCL expressions are executed differs in every subproject as described in the corresponding sections.

For example, consider the following OCL invariant:
```javascript
context Quote inv QuoteOverZero: self.value > 0
```

## emf-ocl-interpreter
Uses EMF's OCL interpreter to execute OCL expressions at runtime (default option "Realisation of OCL embedded within Ecore models" set to "Delegate for interpretation at run-time")

```java
public boolean validateQuote_QuoteOverZero(Quote quote, DiagnosticChain diagnostics, Map<Object, Object> context) {
	return
		validate
			(EurentPackage.Literals.QUOTE,
			 quote,
			 diagnostics,
			 context,
			 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "QuoteOverZero",
			 QUOTE__QUOTE_OVER_ZERO__EEXPRESSION,
			 Diagnostic.ERROR,
			 DIAGNOSTIC_SOURCE,
			 0);
}
```
Well, there is not much to see here. 
What happens in the background is that the constraint is read from the EAnnotation of the EClass Quote as a string and parsed into an [ExpressionInOCL](http://git.eclipse.org/c/ocl/org.eclipse.ocl.git/tree/plugins/org.eclipse.ocl.pivot/src/org/eclipse/ocl/pivot/internal/evaluation/BasicEvaluationVisitor.java) object, which is then traversed and evaluated by a [BasicEvaluationVisitor](http://git.eclipse.org/c/ocl/org.eclipse.ocl.git/tree/plugins/org.eclipse.ocl.pivot/src/org/eclipse/ocl/pivot/internal/evaluation/BasicEvaluationVisitor.java)


## emf-ocl-java 
Executes Java code generated from OCL expressions by EMF's code generator (option "Realisation of OCL embedded within Ecore models" set to "Generate Java Code in *Impl classes")

```java
public boolean QuoteOverZero(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
	/**
	 *
	 * inv QuoteOverZero:
	 *   let severity : Integer[1] = 'Quote::QuoteOverZero'.getSeverity()
	 *   in
	 *     if severity <= 0
	 *     then true
	 *     else
	 *       let result : Boolean[1] = self.value > 0
	 *       in
	 *         'Quote::QuoteOverZero'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
	 *     endif
	 */
	final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
	final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EurentTables.STR_Quote_c_c_QuoteOverZero);
	final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EurentTables.INT_0).booleanValue();
	/*@NonInvalid*/ boolean symbol_0;
	if (le) {
		symbol_0 = ValueUtil.TRUE_VALUE;
	}
	else {
		final /*@NonInvalid*/ int value = this.getValue();
		final /*@NonInvalid*/ IntegerValue BOXED_value = ValueUtil.integerValueOf(value);
		final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_value, EurentTables.INT_0).booleanValue();
		final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, EurentTables.STR_Quote_c_c_QuoteOverZero, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, EurentTables.INT_0).booleanValue();
		symbol_0 = logDiagnostic;
	}
	return Boolean.TRUE == symbol_0;
}
```

## crossecore-java 
Executes Java code generated from OCL expressions by CrossEcore's code generator.

```java
public boolean QuoteOverZero(org.eclipse.emf.common.util.DiagnosticChain diagnostics, java.util.Map<Object, Object> context)
{
  return this.getValue() > 0;
}
```


## References
* Frias, L., Queralt, A., Olivé, A.: EU-rent car rentals specification. Technical Report LSI Research Report. LSI-03-59-R, UPC (2003)
https://upcommons.upc.edu/bitstream/handle/2117/97816/R03-59.pdf
* Cabot J., Gogolla M. (2012) Object Constraint Language (OCL): A Definitive Guide. In: Bernardo M., Cortellessa V., Pierantonio A. (eds) Formal Methods for Model-Driven Engineering. Lecture Notes in Computer Science, vol 7320. Springer, Berlin, Heidelberg https://doi.org/10.1007/978-3-642-30982-3_3
