def classes = [String, List, File]
for (clazz in classes) {
	println clazz.package.name
}

// same but succint
println( [String, List, File]*.package*.name )