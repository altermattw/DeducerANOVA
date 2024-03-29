package DeducerANOVA;

import javax.swing.JTextPane;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class StyledPane extends JTextPane {
    private String bodyFontFamily = "Arial";
    private String bodyFontColor = "black";
    private String bodyFontSize = "9";
    private String tableBorderThickness = "0";
    private String THfontStyle = "italic";
    private String THfontWeight = "normal";
    private String THtextAlign = "center";
    private String THbackgroundColor = "#e8e8e8";
    private String TDtextAlign = "right";
    private String alternatingRowColor = "#dbe8ff";
    
    public StyledPane() {
        super();
        setContentType("text/html"); // ready to accept HTML input
        setEditable(false);
        HTMLEditorKit kit = new HTMLEditorKit();
        setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
             styleSheet.addRule("body {margin-left:10px; margin-top:10px; margin-right:10px; margin-bottom:10px;}");
                     styleSheet.addRule("body {color:" + bodyFontColor + "; font-family:" + bodyFontFamily + "; font-size: " + bodyFontSize + "px;}");
                     styleSheet.addRule("body {background-color:white;}");
                     // internal borders:
                     styleSheet.addRule("table, td, th {border-top-style: solid; border-top-color: black; border-top-width: " + tableBorderThickness + "px;}");
                     // table header and cells
                     styleSheet.addRule("td, th {padding-right: 10px; padding-left: 10px;}");
                     styleSheet.addRule("th {font-style: " + THfontStyle + "; font-weight: " + THfontWeight + "; text-align: " + THtextAlign + "; background-color:" + THbackgroundColor + ";}");
                     styleSheet.addRule("td {font-style: normal; font-weight: normal; text-align: " + TDtextAlign + ";}");
                     // alternating row colors. Use "<tr class=\"d0\"> and "<tr class=\"d1\"> to activate.
                     styleSheet.addRule("tr.d0 td {background-color: #ffffff; color: black;}"); // white
                     styleSheet.addRule("tr.d1 td {background-color: " + alternatingRowColor + "; color: black;}"); // light blue
                     // text elements
                     styleSheet.addRule("div {text-indent: 10 px;}");
                     styleSheet.addRule("p.b {margin-top: 7px; margin-bottom: 7px; font-weight: bold;}");
                     styleSheet.addRule("th.section {padding-top: 10px; padding-bottom: 10px; text-align: center; font-style: normal; font-weight: bold");
                     // pre tag formatting to remove extra line break
                     styleSheet.addRule("pre {margin-bottom: 0px; margin-top: 0px}");

    }
    public StyledPane(String text) {
        super();
        setContentType("text/html"); // ready to accept HTML input
        setEditable(false);
        HTMLEditorKit kit = new HTMLEditorKit();
        setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
             styleSheet.addRule("body {margin-left:10px; margin-top:10px; margin-right:10px; margin-bottom:10px;}");
                     styleSheet.addRule("body {color:" + bodyFontColor + "; font-family:" + bodyFontFamily + "; font-size: " + bodyFontSize + "px;}");
                     styleSheet.addRule("body {background-color:white;}");
                     // internal borders:
                     styleSheet.addRule("table, td, th {border-top-style: solid; border-top-color: black; border-top-width: " + tableBorderThickness + "px;}");
                     // table header and cells
                     styleSheet.addRule("td, th {padding-right: 10px; padding-left: 10px;}");
                     styleSheet.addRule("th {font-style: " + THfontStyle + "; font-weight: " + THfontWeight + "; text-align: " + THtextAlign + "; background-color:" + THbackgroundColor + ";}");
                     styleSheet.addRule("td {font-style: normal; font-weight: normal; text-align: " + TDtextAlign + ";}");
                     // alternating row colors. Use "<tr class=\"d0\"> and "<tr class=\"d1\"> to activate.
                     styleSheet.addRule("tr.d0 td {background-color: #ffffff; color: black;}"); // white
                     styleSheet.addRule("tr.d1 td {background-color: " + alternatingRowColor + "; color: black;}"); // light blue
                     // text elements
                     styleSheet.addRule("div {text-indent: 10 px;}");
                     styleSheet.addRule("p.b {margin-top: 7px; margin-bottom: 7px; font-weight: bold;}");
                     styleSheet.addRule("th.section {padding-top: 10px; padding-bottom: 10px; text-align: center; font-style: normal; font-weight: bold");
                     // pre tag formatting to remove extra line break
                     styleSheet.addRule("pre {margin-bottom: 0px; margin-top: 0px}");
        this.setText(text);
    }
}
