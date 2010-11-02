package intellij;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.javadoc.PsiDocTag;
import intellij.impl.TestClassImpl;
import intellij.impl.TestMethodImpl;

import java.util.ArrayList;

/**
 * User: Jaime Hablutzel
 */
public class BDDCore {
    


    protected BDDCore() {
    }


    /**
     * It loads an existing test class for the psiClass passed OR
     * creates a new TestClass will all of its test methods not yet
     * created, but available in {@link TestClass#getAllMethods()}
     *
     * @param project
     * @param psiClass origin class
     * @return
     * @should create a new test class with test methods unitialized
     * @should return a test class that already exists for a sut class with some test methods initialized
     */
    public static TestClass createTestClass(Project project, PsiClass psiClass) {




        //  instanciar un testclass
        TestClass testClass = new TestClassImpl(psiClass);


        return testClass;
    }

}
