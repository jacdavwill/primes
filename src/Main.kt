import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    //getPrimesUpTo(10000)
    isXPrime(9345694847)
}

fun getPrimesUpTo(num: Int): ArrayList<Int>  {
    assert(num > 1)
    val primes = arrayListOf<Int>()
    (2..num).forEach {num ->
        var isPrime = true
        for (prime in primes) {
            if (num % prime == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(num)
            println(num)
        }
    }
    return primes
}

fun isXPrime(x: Long): Boolean {
    assert(x > 1)
    val primes = arrayListOf<Int>()
    for (num in 2..floor(sqrt(x.toDouble())).toInt()) {
        var isPrime = true
        for (prime in primes) {
            if (num % prime == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            if (x % num == 0.toLong()) {
                println(x.toString() + " = " + num + " x " + (x / num))
                return false
            }
            primes.add(num)
        }
    }
    println(x.toString() + " is prime!")
    return true
}