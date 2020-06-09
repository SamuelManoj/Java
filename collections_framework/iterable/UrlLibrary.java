package collections_framework.iterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> list = new LinkedList<String>();

	private class UrlIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < list.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			StringBuilder sb = new StringBuilder();

			try {
				URL url = new URL(list.get(index));

				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				String line = null;

				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			index++;

			return sb.toString();
		}

		public void remove() {
			list.remove(index);
		}
	}

	public UrlLibrary() {
		list.add("https://www.linkedin.com/in/samuelmanoj/");
		list.add("https://www.facebook.com");
		list.add("https://www.google.com");

	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}

}
