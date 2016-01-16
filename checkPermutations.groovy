/*
It's a short code which tell's if two random strings, even with
integers inside, are permutations of each other or not
 */
def string1 = "acBE2d".toUpperCase().toList().sort().join('')
def string2 = "e2dCAb".toUpperCase().toList().sort().join('')
if (string1==string2) {
    println "These are permutations of each other"
} else {
    println "These are not permutations of each other"
}
//TODO make method and optimize the code
