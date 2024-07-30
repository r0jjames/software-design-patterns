package structural_patterns.adapter;

import structural_patterns.adapter.thirdPartyFilter.Caramel;

public class CaramelFilter implements Filter {
    private final Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.render(image);
    }
}
