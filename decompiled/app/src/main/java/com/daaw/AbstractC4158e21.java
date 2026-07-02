package com.daaw;

/* JADX INFO: renamed from: com.daaw.e21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4158e21 {

    /* JADX INFO: renamed from: com.daaw.e21$a */
    public static class a implements b {
        public final /* synthetic */ AbstractC4340ei a;

        public a(AbstractC4340ei abstractC4340ei) {
            this.a = abstractC4340ei;
        }

        @Override // com.daaw.AbstractC4158e21.b
        public byte a(int i) {
            return this.a.w(i);
        }

        @Override // com.daaw.AbstractC4158e21.b
        public int size() {
            return this.a.size();
        }
    }

    /* JADX INFO: renamed from: com.daaw.e21$b */
    public interface b {
        byte a(int i);

        int size();
    }

    public static String a(AbstractC4340ei abstractC4340ei) {
        return b(new a(abstractC4340ei));
    }

    public static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte bA = bVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(AbstractC4340ei.I(str));
    }
}
