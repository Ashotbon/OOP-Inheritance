package pack5;

public class WorldWarIIAiroplane extends Aircraft {
    private boolean twinEngine;

    public WorldWarIIAiroplane() {
        super();
        this.twinEngine = true;
    }

    public WorldWarIIAiroplane(double price, double maximumElevation, boolean twinEngine) {
        super(price, maximumElevation);
        this.twinEngine = twinEngine;
    }

    public WorldWarIIAiroplane(WorldWarIIAiroplane other) {
        super(other);
        this.twinEngine = other.twinEngine;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        WorldWarIIAiroplane that = (WorldWarIIAiroplane) obj;

        return super.equals(obj) && twinEngine == that.twinEngine;
    }
}
