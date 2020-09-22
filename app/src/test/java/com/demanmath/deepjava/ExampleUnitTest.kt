package com.demanmath.deepjava

import com.demanmath.deepjava.cache.CacheShow
import com.demanmath.deepjava.cache.ConstantShow
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun run(){
        var cacheShow = CacheShow()
        cacheShow.fun1()

        var constantShow = ConstantShow()
        constantShow.`fun`()
    }
}