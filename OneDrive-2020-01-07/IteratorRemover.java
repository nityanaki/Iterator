//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;
import java.util.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		String[] words= line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove=rem;
	}

	public void setTest(String line, String rem)
	{
		String[] words= line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove=rem;
	}

	public void remove()
	{
		ListIterator<String> it = list.listIterator();
		while (it.hasNext())
		{
			if (it.next().equals(toRemove))
				it.remove();
		}
	}

	public String toString()
	{
		return list.toString()+"\n";
	}
}