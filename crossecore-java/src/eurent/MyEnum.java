package eurent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum MyEnum implements org.eclipse.emf.common.util.Enumerator{
	EINS(0, "eins", "eins")
;	public static final int EINS_VALUE = 0;
	
	private static final MyEnum[] VALUES_ARRAY =
		new MyEnum[] {
		EINS
		};
	public static final List<MyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static MyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static MyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static MyEnum get(int value) {
		switch (value) {
			
			case EINS_VALUE: return EINS;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private MyEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
	  return value;
	}

	public String getName() {
	  return name;
	}

	public String getLiteral() {
	  return literal;
	}

	@Override
	public String toString() {
		return literal;
	}
			
}
