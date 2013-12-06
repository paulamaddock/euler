/**
 * Euler Project Problem 7 10001st prime number
 */
int i = 1
int count = 0

List firstPrimes = []
Boolean prime


while (count <= 10001) {
    i++
    prime = true
    for (num in firstPrimes ){
        if (i % num == 0) {
            prime = false
            break;
        } 
    }
    if (prime){
    count++
    firstPrimes << i
    }
}

println firstPrimes[10000]