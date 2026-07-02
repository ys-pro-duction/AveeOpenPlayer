package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Nr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1724Nr0 implements InterfaceC7649qV0 {
    public transient InterfaceC7927rV0 a = null;
    public final List b = new ArrayList();

    @Override // com.daaw.InterfaceC7649qV0
    public InterfaceC7927rV0 a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7649qV0
    public void b(OutputStream outputStream, String str) throws IOException {
        byte[] bArr = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
        Arrays.fill(bArr, (byte) 0);
        bArr[4] = 105;
        bArr[5] = 114;
        bArr[6] = 105;
        bArr[7] = 118;
        bArr[8] = 101;
        bArr[9] = 114;
        bArr[10] = 32;
        bArr[11] = 85;
        bArr[12] = 77;
        bArr[13] = 83;
        bArr[14] = 32;
        bArr[15] = 80;
        bArr[16] = 76;
        bArr[17] = 65;
        int size = this.b.size();
        bArr[3] = (byte) (size & 255);
        bArr[2] = (byte) ((size & 65280) >> 8);
        bArr[1] = (byte) ((16711680 & size) >> 16);
        bArr[0] = (byte) ((size & (-16777216)) >> 24);
        outputStream.write(bArr);
        for (String str2 : this.b) {
            Arrays.fill(bArr, (byte) 0);
            int iLastIndexOf = str2.lastIndexOf(47);
            int iLastIndexOf2 = str2.lastIndexOf(92);
            int i = (iLastIndexOf > iLastIndexOf2 ? iLastIndexOf + 1 : iLastIndexOf2 > iLastIndexOf ? iLastIndexOf2 + 1 : 0) + 1;
            bArr[1] = (byte) (i & 255);
            bArr[0] = (byte) ((i & 65280) >> 8);
            byte[] bytes = str2.getBytes("UTF-16BE");
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    public List c() {
        return this.b;
    }

    public void d(InterfaceC7927rV0 interfaceC7927rV0) {
        this.a = interfaceC7927rV0;
    }
}
