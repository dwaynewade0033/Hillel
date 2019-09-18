package ShablonPatternOOP;

public abstract class HouseTemplate {
    public final void build(){
        buildFoundation();
        buildWindow();
        buildwals();
    }
        protected abstract void  buildFoundation();
        protected abstract void  buildWindow();
        protected abstract void  buildwals();
}
