# examples-eurent

The contents of this repository demonstrate the execution of OCL invariants, derived attributes and model queries on the basis of the EU-rent car rentals specification.
This repository has three subprojects, i.e., **emf-ocl-interpreter**, **emf-ocl-java**, **crossecore-java**
Each project contains source code generated from the same Ecore model. 
However, the way how OCL expressions are executed differs in every subproject as described in the corresponding sections.

For example, consider the following OCL derived attribute:
```javascript
context Customer::discount: integer
derive:
  if not self.premium then
    if self.rental.car.carGroup->select(c|c.category='high')->size()>5
    then 15
    else 0 
    endif
  else 30 
  endif;
```

## emf-ocl-interpreter
Uses EMF's OCL interpreter to execute OCL expressions at runtime (default option "Realisation of OCL embedded within Ecore models" set to "Delegate for interpretation at run-time")

```java
public int getDiscount() {
  return (Integer)DISCOUNT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
}
```
Well, not to see much here. 

## emf-ocl-java 
Executes Java code generated from OCL expressions by EMF's code generator (option "Realisation of OCL embedded within Ecore models" set to "Generate Java Code in *Impl classes")

## crossecore-java 
Executes Java code generated from OCL expressions by CrossEcore's code generator.

```java
public int getDiscount()
{
  return 
    ! this.getPremium() ? 
      this.getRental().getCar().collect(temp1 -> temp1.getCarGroup()).select(c -> c.getCategory() == "high").size() > 5 
      ? 15 
      : 0 
    : 30;
}
```


## References
* Frias, L., Queralt, A., Olivé, A.: EU-rent car rentals specification. Technical Report LSI Research Report. LSI-03-59-R, UPC (2003)
https://upcommons.upc.edu/bitstream/handle/2117/97816/R03-59.pdf
* Cabot J., Gogolla M. (2012) Object Constraint Language (OCL): A Definitive Guide. In: Bernardo M., Cortellessa V., Pierantonio A. (eds) Formal Methods for Model-Driven Engineering. Lecture Notes in Computer Science, vol 7320. Springer, Berlin, Heidelberg https://doi.org/10.1007/978-3-642-30982-3_3
