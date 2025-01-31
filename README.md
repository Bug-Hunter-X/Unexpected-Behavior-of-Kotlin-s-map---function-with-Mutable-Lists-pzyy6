# Unexpected Behavior of Kotlin's map() function with Mutable Lists

This repository demonstrates a common pitfall when using Kotlin's `map()` function with mutable lists.  The `map()` function, by default, creates a *new* list containing the transformed elements, leaving the original list unchanged. This behavior can be unexpected if you're accustomed to languages where `map()` modifies the original collection in place.

The example code highlights the difference between using `map()` with immutable and mutable lists, and introduces `mapInPlace` as a solution for modifying the original list directly.

## How to Reproduce

1. Clone this repository.
2. Open `bug.kt` and run the code. Observe that the mutable list remains unchanged after the `map()` operation. Only `mapInPlace` will modify the mutableList

## Solution

The `bugSolution.kt` file demonstrates how to use `mapInPlace()` to modify the mutable list directly.

This example underscores the importance of understanding the immutability features of Kotlin collections and choosing the appropriate collection functions based on your needs.