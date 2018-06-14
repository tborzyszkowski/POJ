package pl.pawel095.sokoban.mapfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import pl.pawel095.sokoban.iterator.Container;
import pl.pawel095.sokoban.iterator.Iterator;

class TileReader implements Container {
	private class TileIterator implements Iterator {
		private int lastChar;

		@Override
		public boolean hasNext() {
			try {
				if (lastChar == -1) {
					return false;
				}
				return in.ready();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public String next() {
			String ret = "";
			try {
				do {
					lastChar = in.read();
					// dorobić poprawnie ładowanie z pliku
					// w którym enterem jest CR a nie CRLF
					ret += Character.toString((char) lastChar);

				} while (lastChar != ' ' && lastChar != 0x0d && lastChar != -1);
				ret=ret.substring(0, ret.length()-1);

			} catch (IOException e) {
				e.printStackTrace();
				return "-1";
			}
			return ret;
		}

	}

	private FileReader in;
	private TileIterator instance;

	public TileReader(File f) {
		instance=new TileIterator();
		try {
			in = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		in.close();
		super.finalize();
	}

	@Override
	public Iterator getIterator() {
		if (instance == null) {
			instance = new TileIterator();
		}
		return instance;
	}

}