package org.jsoup.nodes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
public class imageBuilder extends LeafNodeBuilder {
    String data;
    String baseUri = null;
    int Count = 0;
    public imageBuilder(String _type, String _data) {
        super.type = _type;
        data = _data;
        StoreImage();

    }
    public imageBuilder(String _type, String _data, String _baseUri){
        super.type = _type;
        data = _data;
        baseUri = _baseUri;
        StoreImage();

    }
    public void StoreImage(){
        Count++;
        URL url = null;
        InputStream in = null;
        OutputStream out = null;

        try {

            url = new URL(data);

            in = url.openStream();


            out = new FileOutputStream("Image"+Count+".jpg");

            while(true){
                //이미지를 읽어온다.
                int data = in.read();
                if(data == -1){
                    break;
                }
                //이미지를 쓴다.
                out.write(data);

            }

            in.close();
            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
    public void buildPubsyskey(){
        para.setPubSysKey(null);
    }
    public void buildData(){
        para.setData(data);
    };
    public void buildbasUri(){
        para.setBaseUrl(baseUri);
    };
    public void buildText(){
        para.setText(null);
    };
    public void buildName(){
        para.setName(null);
    };
    public void buildPublicld(){
        para.setPublicld(null);
    };
    public void buildSystemId(){
        para.setSystemId(null);
    };
    public void buildIsProcessingInstruction(){
        para.setProcessingInstruction(false);
    };
}
