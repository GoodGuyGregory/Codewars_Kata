fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String

// Solution: 
fun joinOptions(options: Collection<String>) = options.joinToString(prefix ="[", postfix ="]")