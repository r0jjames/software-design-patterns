package structural_patterns.adapter;

import structural_patterns.adapter.thirdPartyFilter.Caramel;

// Another approach but not perfect solution. Favor composition than inheritance
public class CameralAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
