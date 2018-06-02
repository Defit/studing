package fwk;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.IMethodSelector;
import org.testng.IMethodSelectorContext;
import org.testng.ITestNGMethod;

public class NewAnnotationMethodSelector implements IMethodSelector {
	
	public boolean includeMethod(IMethodSelectorContext context, ITestNGMethod method, boolean isTestMethod) {
		// TODO Auto-generated method stub
		List<String> includeGroups = method.getXmlTest().getIncludedGroups();
		List<String> excludeGroups = method.getXmlTest().getExcludedGroups();
		Method testMethod = method.getConstructorOrMethod().getMethod();

		if (includeGroups == null || includeGroups.isEmpty() || !testMethod.isAnnotationPresent(NewAnnotation.class))
		{
			return false;
		}
		else
		{
			NewAnnotation newAnnotation = testMethod.getAnnotation(NewAnnotation.class);
			
			if (includeGroups.contains(newAnnotation.value()) && !excludeGroups.contains(newAnnotation.value()))
			{
				
				return true;
			}
		}
		return false;
	}

	public void setTestMethods(List<ITestNGMethod> testMethods) {
		// TODO Auto-generated method stub

	}

}
