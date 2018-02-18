package renderEngine;

/*
* Basically we need to create and bind array of vertices to opengl
* only after that we will have an access to ID's in memory of this arrays
* and store it's length and ID
* */
public class RawModel {

    private int vaoID;
    private int vertexCount;

    public RawModel(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }

    public int getVaoID(){
        return vaoID;
    }

    public int getVertexCount() {
        return vertexCount;
    }
}
