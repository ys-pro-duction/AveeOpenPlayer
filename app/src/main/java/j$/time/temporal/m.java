package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements TemporalAdjuster {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final k y(k kVar) {
        switch (this.a) {
            case 0:
                int i = kVar.get(ChronoField.DAY_OF_WEEK);
                int i2 = this.b;
                if (i == i2) {
                    return kVar;
                }
                return kVar.e(i - i2 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i3 = kVar.get(ChronoField.DAY_OF_WEEK);
                int i4 = this.b;
                if (i3 == i4) {
                    return kVar;
                }
                return kVar.n(i4 - i3 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
