package tests;

import com.codename1.testing.AbstractTest;

import com.codename1.ui.Display;

public class TrivecTest extends AbstractTest {
    public boolean runTest() throws Exception {
        waitForFormName("Main");
        clickButtonByLabel("About");
        clickButtonByLabel("Demo");
        clickButtonByName("Button");
        clickButtonByLabel("Map");
        clickButtonByLabel("-");
        clickButtonByLabel("+");
        clickButtonByLabel("Settings");
        pointerPress(0.9447236f, 0.42156863f, "MultiButton2");
        waitFor(47);
        pointerRelease(0.9447236f, 0.42156863f, "MultiButton2");
        pointerPress(0.9583333f, 0.5113636f, "MultiButton4");
        waitFor(47);
        pointerRelease(0.9583333f, 0.5113636f, "MultiButton4");
        pointerPress(0.96464646f, 0.38636363f, "MultiButton1");
        waitFor(62);
        pointerRelease(0.96464646f, 0.38636363f, "MultiButton1");
        pointerPress(0.085f, 0.47368422f, null);
        waitFor(78);
        pointerRelease(0.085f, 0.47368422f, null);
        return true;
    }
}
