@Grab('commons-lang:commons-lang:2.6')
import org.apache.commmons.lang.ClassUtils

class Outer {
	class Inner {}
}

assert !ClassUtils.isInnerClass(Outer)
assert ClassUtils.isInnerClass(Outer.Inner)