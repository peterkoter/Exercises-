/*
It returns if two strings are permutations of each other or not
 */
def checkPermutations(String txt1, String txt2) {
    def string1 = txt1.toUpperCase().toList().sort()
    def string2 = txt2.toUpperCase().toList().sort()
    if (string1 == string2) {
        println 'These are permutations of each other'
    } else {
        println 'These are not permutations of each other'
    }
}

checkPermutations("acBE234#d", "e2dC43Ab#")
