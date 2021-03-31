
package com.video.domain;
import com.video.exceptions.EmptyFieldException;
public class Video {
	
		protected String URL;
		protected String title;
		protected String[] tags;
		/*
		 * Constructor para los usuarios
		 * @param name URL URL del video
		 * @param title title del video
		 * @param tags tags del video
		 */

		public Video (String URL, String title,String[]tags) throws Exception{
			if(URL.contentEquals("")) throw new EmptyFieldException(" URL esta en blanco ");
			if(title.contentEquals("")) throw new EmptyFieldException(" no has introducido el titulo  ");
			if(tags.length==0) throw new EmptyFieldException("no has introducido tags, esta en blanco");
			this.URL = URL;
			this.title = title;
			this.tags = tags;
	}
		public String getURL() {
			return URL;
		}
		public void setURL(String uRL) {
			URL = uRL;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String[] getTags() {
			String[] lostags=this.tags;
			for (int i = 0; i < tags.length; i++) {
				lostags[i]=tags[i];
				System.out.println("Tag "+(i+1)+": "+ tags[i]);
			}
			return lostags;
		}
		public void setTags(String[] tags) {
			this.tags = tags;
		}	
		

}
