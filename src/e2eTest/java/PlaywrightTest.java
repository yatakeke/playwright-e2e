import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PlaywrightTest {

    @Test
    public void trialTest() {
        try (Playwright playwright = Playwright.create()) {
            var browser = playwright.chromium().launch();
            var page = browser.newPage();
            page.navigate("https://playwright.dev");

            assertThat(page).hasTitle(Pattern.compile("Playwright"));

        }
    }
}
