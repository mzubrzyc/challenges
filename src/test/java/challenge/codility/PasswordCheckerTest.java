package challenge.codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordCheckerTest {

    @Test
    void check() {
        assertThat(PasswordChecker.check("FooBar123!")).isTrue();
        assertThat(PasswordChecker.check("foobar123!")).isFalse();
        assertThat(PasswordChecker.check("FooBar123")).isFalse();
        assertThat(PasswordChecker.check("FObar! FObar!")).isFalse();
        assertThat(PasswordChecker.check("Foo**")).isFalse();
    }
}