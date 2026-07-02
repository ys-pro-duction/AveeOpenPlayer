package com.daaw;

/* JADX INFO: renamed from: com.daaw.m71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6435m71 {

    /* JADX INFO: renamed from: com.daaw.m71$a */
    public static final class a implements InterfaceC6435m71 {
        public static final a a = new a();

        @Override // com.daaw.InterfaceC6435m71
        public void a(InterfaceC5586j71 interfaceC5586j71, Z71 z71, I80 i80) {
            G10.g(interfaceC5586j71, "typeAlias");
            G10.g(i80, "substitutedArgument");
        }

        @Override // com.daaw.InterfaceC6435m71
        public void b(InterfaceC5586j71 interfaceC5586j71) {
            G10.g(interfaceC5586j71, "typeAlias");
        }

        @Override // com.daaw.InterfaceC6435m71
        public void c(C8957v81 c8957v81, I80 i80, I80 i802, Z71 z71) {
            G10.g(c8957v81, "substitutor");
            G10.g(i80, "unsubstitutedArgument");
            G10.g(i802, "argument");
            G10.g(z71, "typeParameter");
        }

        @Override // com.daaw.InterfaceC6435m71
        public void d(O7 o7) {
            G10.g(o7, "annotation");
        }
    }

    void a(InterfaceC5586j71 interfaceC5586j71, Z71 z71, I80 i80);

    void b(InterfaceC5586j71 interfaceC5586j71);

    void c(C8957v81 c8957v81, I80 i80, I80 i802, Z71 z71);

    void d(O7 o7);
}
