package com.hitanshudhawan.spannablestringparser

// SpannableStringParser

private var customSpanner: (String, String) -> Any? = { _, _ -> null }

/**
 * Add custom properties to span.
 */
fun spanner(spanner: (property: String, value: String) -> Any?) {
    customSpanner = spanner
}

/**
 * Converts a String into SpannableString.
 */
fun CharSequence.spannify() = tokenize().parse().spannify(customSpanner)
