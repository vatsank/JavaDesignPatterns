package com.training.iterator;

public class SkillContainer implements MyContainer {

	private String[] skills;
	
	public SkillContainer(String[] skills) {
		super();
		this.skills = skills;
	}


	@Override
	public StringIterator createIterator() {
		
		StringIterator itr=new SkillIterator();
		return itr;
	}

	
	private class SkillIterator implements StringIterator{
         
		  int pos;
		@Override
		public boolean hasNext() {
		
	        if (pos < skills.length)
	              return true;
	          else
	     return false;

		}

		@Override
		public Object next() {
		
			if (this.hasNext())
                return skills[pos++];
                 else
            return null;

		}
		
		
	}
}
