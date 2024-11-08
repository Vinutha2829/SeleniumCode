package seleniumSession;

public class CustomCssSelector {

	public static void main(String[] args) {
		//  #id:
		//  #shub70
		// .class
		//  .selectors-input.jsSelector
		//other attribute:
		//   input[title='Email']       input[placeholder='Enter email']
		//Text  not support in Css Selector.
		// multiple attributes
		//  input[placeholder='Enter email'][title='Email']  input[placeholder][title='Email']     input[placeholder][title]
		// contains in css selector  ===*
		//  input[placeholder*='First']  placeholder =First Enter name
		// starts-with in css selector ===^
		// input[placeholder^='First'] placeholder =First Enter name
		// ends-with in css selector 
		 //  input[placeholder$='name'] placeholder =First Enter name
		
		//parent to child:  space ==indirect+direct   .> ===direct
		// tr[class='usr_acn'] td input
		// tr[class='usr_acn']>td>input
		
		//child to parent is not suported in css selector
		
		//following-sibling:  + immediate following-sibling  ~ All following-sibling
		// td[class='left']+td
		//td[class='left']~td 
		
		//preceding-sibling is not supported in css selector
		
		//indexing in css selector:
		
		//select[id='country']>option:last-child
		//select[id='country']>option:nth-child(2)
		//select[id='country']>option:nth-last-child(2)  ---last to second one element
		//select[id='country']>option:nth-child(odd) --odd nos
		// select[id='country']>option:nth-child(even)  --even nos
		//select[id='country']>option:nth-child(n+4)  --starts from 4th element

	}

}
