package com.daaw;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ou1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1841Ou1 extends AbstractC4970gu1 {
    public final Object N;
    public final InterfaceC5808ju1 O;

    public AbstractC1841Ou1(int i, String str, InterfaceC5808ju1 interfaceC5808ju1, InterfaceC5526iu1 interfaceC5526iu1) {
        super(i, str, interfaceC5526iu1);
        this.N = new Object();
        this.O = interfaceC5808ju1;
    }

    @Override // com.daaw.AbstractC4970gu1
    public final C6096ku1 a(C3845cu1 c3845cu1) {
        String str;
        String str2;
        try {
            byte[] bArr = c3845cu1.b;
            Map map = c3845cu1.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(c3845cu1.b);
        }
        return C6096ku1.b(str, AbstractC1114Hu1.b(c3845cu1));
    }

    public void o(String str) {
        InterfaceC5808ju1 interfaceC5808ju1;
        synchronized (this.N) {
            interfaceC5808ju1 = this.O;
        }
        interfaceC5808ju1.zza(str);
    }
}
