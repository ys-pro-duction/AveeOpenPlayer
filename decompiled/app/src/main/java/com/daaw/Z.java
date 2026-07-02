package com.daaw;

import com.daaw.S;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z implements InterfaceC2792Xs0 {
    public static final C6763nJ a = C6763nJ.c();

    public final InterfaceC2026Qj0 d(InterfaceC2026Qj0 interfaceC2026Qj0) throws Q10 {
        if (interfaceC2026Qj0 == null || interfaceC2026Qj0.e()) {
            return interfaceC2026Qj0;
        }
        throw e(interfaceC2026Qj0).a().i(interfaceC2026Qj0);
    }

    public final C91 e(InterfaceC2026Qj0 interfaceC2026Qj0) {
        return interfaceC2026Qj0 instanceof S ? ((S) interfaceC2026Qj0).h() : new C91(interfaceC2026Qj0);
    }

    @Override // com.daaw.InterfaceC2792Xs0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC2026Qj0 a(InputStream inputStream, C6763nJ c6763nJ) {
        return d(h(inputStream, c6763nJ));
    }

    @Override // com.daaw.InterfaceC2792Xs0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC2026Qj0 b(InputStream inputStream, C6763nJ c6763nJ) {
        return d(i(inputStream, c6763nJ));
    }

    public InterfaceC2026Qj0 h(InputStream inputStream, C6763nJ c6763nJ) throws Q10 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return i(new S.a.C0116a(inputStream, C9687xm.A(i, inputStream)), c6763nJ);
        } catch (IOException e) {
            throw new Q10(e.getMessage());
        }
    }

    public InterfaceC2026Qj0 i(InputStream inputStream, C6763nJ c6763nJ) throws Q10 {
        C9687xm c9687xmG = C9687xm.g(inputStream);
        InterfaceC2026Qj0 interfaceC2026Qj0 = (InterfaceC2026Qj0) c(c9687xmG, c6763nJ);
        try {
            c9687xmG.a(0);
            return interfaceC2026Qj0;
        } catch (Q10 e) {
            throw e.i(interfaceC2026Qj0);
        }
    }
}
