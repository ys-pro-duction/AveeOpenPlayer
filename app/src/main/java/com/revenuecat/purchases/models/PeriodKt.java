package com.revenuecat.purchases.models;

import com.daaw.C0576Cs0;
import com.daaw.C8146sG0;
import com.daaw.InterfaceC2536Vg0;
import com.revenuecat.purchases.models.Period;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lcom/daaw/Cs0;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "toPeriod", "(Ljava/lang/String;)Lcom/daaw/Cs0;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PeriodKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C0576Cs0 toPeriod(String str) {
        InterfaceC2536Vg0 interfaceC2536Vg0A = new C8146sG0("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").a(str);
        if (interfaceC2536Vg0A == null) {
            return new C0576Cs0(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        InterfaceC2536Vg0.b bVarA = interfaceC2536Vg0A.a();
        String str2 = (String) bVarA.a().b().get(1);
        String str3 = (String) bVarA.a().b().get(2);
        String str4 = (String) bVarA.a().b().get(3);
        String str5 = (String) bVarA.a().b().get(4);
        int iIntValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str2)).intValue();
        int iIntValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str3)).intValue();
        int iIntValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str4)).intValue();
        int iIntValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str5)).intValue();
        return iIntValue > 0 ? new C0576Cs0(Integer.valueOf(iIntValue), Period.Unit.YEAR) : iIntValue2 > 0 ? new C0576Cs0(Integer.valueOf(iIntValue2), Period.Unit.MONTH) : iIntValue3 > 0 ? new C0576Cs0(Integer.valueOf(iIntValue3), Period.Unit.WEEK) : iIntValue4 > 0 ? new C0576Cs0(Integer.valueOf(iIntValue4), Period.Unit.DAY) : new C0576Cs0(0, Period.Unit.UNKNOWN);
    }
}
