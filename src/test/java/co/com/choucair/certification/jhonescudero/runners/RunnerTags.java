package co.com.choucair.certification.jhonescudero.runners;
import co.com.choucair.certification.jhonescudero.model.AcademyChoucairData;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/choucairAcademy.feature",
        tags="@stories",
        glue="co.com.choucair.certification.jhonescudero.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnerTags {
}