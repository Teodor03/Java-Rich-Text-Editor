package advanced_notepad;

import java.awt.Font;
import java.awt.Insets;

@Properties_of_class(name="Advanced_notepad_main",function="This is a class containing the text and the properties of the text. The object of this class is saved in xml format.",version="1.0")
public class Advanced_notepad_save_xml {

	private String text,font;
	private int r,g,b;
	private String size_of_text,margin_bottom,margin_left,margin_right,margin_up;
	private boolean bold,italic,wordstylewrap;
	private Font f;
	private Insets m;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text=text;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font=font;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r=r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g=g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b=b;
	}

	public String getSize_of_text() {
		return size_of_text;
	}

	public void setSize_of_text(String size_of_text) {
		this.size_of_text=size_of_text;
	}

	public String getMargin_bottom() {
		return margin_bottom;
	}

	public void setMargin_bottom(String margin_bottom) {
		this.margin_bottom=margin_bottom;
	}

	public String getMargin_left() {
		return margin_left;
	}

	public void setMargin_left(String margin_left) {
		this.margin_left=margin_left;
	}

	public String getMargin_right() {
		return margin_right;
	}

	public void setMargin_right(String margin_right) {
		this.margin_right=margin_right;
	}

	public String getMargin_up() {
		return margin_up;
	}

	public void setMargin_up(String margin_up) {
		this.margin_up=margin_up;
	}

	public boolean isBold() {
		return bold;
	}

	public void setBold(boolean bold) {
		this.bold=bold;
	}

	public boolean isItalic() {
		return italic;
	}

	public void setItalic(boolean italic) {
		this.italic=italic;
	}

	public boolean isWordstylewrap() {
		return wordstylewrap;
	}

	public void setWordstylewrap(boolean wordstylewrap) {
		this.wordstylewrap=wordstylewrap;
	}

	public Font getF() {
		return f;
	}

	public void setF(Font f) {
		this.f=f;
	}

	public Insets getM() {
		return m;
	}

	public void setM(Insets m) {
		this.m=m;
	}
	
	
}
