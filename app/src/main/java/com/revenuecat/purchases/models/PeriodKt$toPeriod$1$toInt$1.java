package com.revenuecat.purchases.models;

import com.daaw.AbstractC10178zY0;
import com.daaw.AbstractC4192e90;
import com.daaw.DY0;
import com.daaw.G10;
import com.daaw.NQ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class PeriodKt$toPeriod$1$toInt$1 extends AbstractC4192e90 implements NQ {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // com.daaw.NQ
    public final Integer invoke(String str) {
        G10.g(str, "part");
        Integer numG = AbstractC10178zY0.g(DY0.F0(str, 1));
        return Integer.valueOf(numG != null ? numG.intValue() : 0);
    }
}
