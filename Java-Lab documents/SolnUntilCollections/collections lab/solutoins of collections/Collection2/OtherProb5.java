/* Test how to sort List of strings*/

package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtherProb5 {

	public static void main(String[] args) {
		 List<String> aryLst = new ArrayList<String>();
	      aryLst.add("hai");
	      aryLst.add("are");
	      aryLst.add("nan");
	      aryLst.add("wer");
	      System.out.println("before sorting...>"+aryLst);

	      Collections.sort(aryLst);
	      System.out.println("After Sorting---->"+aryLst);



	}

}
