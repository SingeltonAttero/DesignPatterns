package patterns.adapter.graphics;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 *
 * реализация через наследования
 *
 */
public class VectorFromRasterAdapterInheritance extends RasterGraphics implements VectorGraphic{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
