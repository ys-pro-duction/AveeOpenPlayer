package org.conscrypt;

import com.daaw.AbstractC6967o20;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;

/* JADX INFO: loaded from: classes4.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        return requestedServerName == null ? Collections.EMPTY_LIST : Collections.singletonList(AbstractC6967o20.a(requestedServerName));
    }
}
