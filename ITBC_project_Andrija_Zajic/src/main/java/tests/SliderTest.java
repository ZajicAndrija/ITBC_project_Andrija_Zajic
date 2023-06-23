package tests;

import org.testng.annotations.Test;

public class SliderTest extends BaseTest{

    @Test
    public void scenario4id001()  {
        getSliderPage().open().moveSlider();

    }
}
