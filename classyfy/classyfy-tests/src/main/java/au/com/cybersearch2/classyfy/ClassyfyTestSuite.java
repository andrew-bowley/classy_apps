package au.com.cybersearch2.classyfy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import au.com.cybersearch2.classyfy.provider.ClassyFyProviderTest;
import au.com.cybersearch2.classyjpa.entity.PersistenceLoaderTest;
import au.com.cybersearch2.classyjpa.entity.UserPersistenceContainerTest;

/**
 * Created by andrew on 21/07/2015.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainActivityTest.class,
        TitleSearchResultsActivityTest.class,
        ClassyFyProviderTest.class,
        PersistenceLoaderTest.class,
        UserPersistenceContainerTest.class
        })
public class ClassyfyTestSuite
{
}