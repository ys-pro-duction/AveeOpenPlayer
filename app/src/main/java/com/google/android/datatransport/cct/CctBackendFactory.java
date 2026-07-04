package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.daaw.AbstractC4400eu;
import com.daaw.C1691Nj;
import com.daaw.G51;
import com.daaw.InterfaceC2523Vd;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements InterfaceC2523Vd {
    @Override // com.daaw.InterfaceC2523Vd
    public G51 create(AbstractC4400eu abstractC4400eu) {
        return new C1691Nj(abstractC4400eu.b(), abstractC4400eu.e(), abstractC4400eu.d());
    }
}
