# java-fundamentals

## Files/Methods

# Java Primitives and Control Flow

Files: Main.java

Methods: main, pluralize, flipNHeads, clock

# Arrays for Loops, Testing

files: Library.java, LibraryTest.java. I'm about to throw up from exhaustion so I'm going to keep this short tonight.

Methods:

### Roll

- Instantiated an empty array with a size dependent on the `n` input
- Roll: Imported an `API` that allowed me to set a random number between 1-6
- `for-loop`ed through the length of that empty array and on each iteration I rolled the dice on my RNG between 1-6, but that could easily be user-input too
- at the end of each iteration the random number would be saved to it's `i`th position in the array

### containsDuplicates

- `for-loop`ed through a test-array and then immediately again through the remaining indexes
- Made an if statement so that if any index value was the same as another the statement would return `true`, that there are duplicates in the code

### calculateAverage

- took in a test array and instantiated a `total` value to zero to function as a counter
- `for-loop`ed through the test array, and with every iteration added the value of the index to that `total` counter
- outside of the loop, I set the counter to be divided by the length of the array the method took in to create the average

### calculateLowAverage

- Took in an array of arrays from the test
- created an empty array to house the averages from each nested array
- created a `total` counter and made a nested `for loop` iterating through the parent and then each index of it's child arrays and summed their values with the `total` counter
- I averaged out the counter by dividing the total by the array it was calculated from and added that average to the empty array, in the same order that it was taken into the loop, so each average's index is identical to the array it came from
- I used a third `for loop` to find the smallest average within the array and as importantly, it's index
- returned the index from my array of averages as the index of the array the method took in
