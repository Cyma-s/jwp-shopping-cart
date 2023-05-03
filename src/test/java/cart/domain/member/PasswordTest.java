package cart.domain.member;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PasswordTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    @DisplayName("validateIsBlank() : 비밀번호를 공백으로 입력 시 IllegalArgumentException가 발생합니다.")
    void test_validateIsBlank_IllegalArgumentException(final String value) throws Exception {
        //when & then
        assertThatThrownBy(() -> new Password(value))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
