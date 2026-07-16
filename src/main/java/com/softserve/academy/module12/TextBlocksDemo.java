package com.softserve.academy.module12;

public class TextBlocksDemo {

    // ── 1. JSON payload ──────────────────────────────────────────────────────

    static String buildUserJson(String name, int age, String email) {
        return """
                {
                  "name": "%s",
                  "age": %d,
                  "email": "%s",
                  "active": true
                }
                """.formatted(name, age, email);
    }

    // ── 2. HTML page template ─────────────────────────────────────────────────

    static String buildHtmlPage(String title, String heading, String body) {
        return """
                <!DOCTYPE html>
                <html lang="uk">
                  <head>
                    <meta charset="UTF-8">
                    <title>%s</title>
                  </head>
                  <body>
                    <h1>%s</h1>
                    <p>%s</p>
                  </body>
                </html>
                """.formatted(title, heading, body);
    }

    // ── 3. SQL query ──────────────────────────────────────────────────────────

    static String buildSelectQuery(String table, String column, String value) {
        return """
                SELECT id, name, email
                FROM %s
                WHERE %s = '%s'
                ORDER BY name;
                """.formatted(table, column, value);
    }

    // ── 4. SQL INSERT ─────────────────────────────────────────────────────────

    static String buildInsertQuery(String name, int age, String email) {
        return """
                INSERT INTO users (name, age, email, active, created_at)
                VALUES ('%s', %d, '%s', true, NOW());
                """.formatted(name, age, email);
    }

    // ── 5. SQL UPDATE ─────────────────────────────────────────────────────────

    static String buildUpdateQuery(String newEmail, String newRole, int userId) {
        return """
                UPDATE users
                SET email = '%s',
                    role  = '%s',
                    updated_at = NOW()
                WHERE id = %d;
                """.formatted(newEmail, newRole, userId);
    }

    // ── 6. SQL JOIN ───────────────────────────────────────────────────────────

    static String buildJoinQuery(String role) {
        return """
                SELECT u.id,
                       u.name,
                       u.email,
                       o.total_amount,
                       o.created_at AS order_date
                FROM users u
                INNER JOIN orders o ON u.id = o.user_id
                WHERE u.role = '%s'
                  AND o.status = 'completed'
                ORDER BY o.created_at DESC;
                """.formatted(role);
    }

    // ── 7. SQL CREATE TABLE ───────────────────────────────────────────────────

    static final String CREATE_USERS_TABLE = """
            CREATE TABLE IF NOT EXISTS users (
                id         SERIAL PRIMARY KEY,
                name       VARCHAR(100) NOT NULL,
                email      VARCHAR(150) NOT NULL UNIQUE,
                age        INT          CHECK (age >= 0),
                role       VARCHAR(50)  DEFAULT 'user',
                active     BOOLEAN      DEFAULT true,
                created_at TIMESTAMP    DEFAULT NOW(),
                updated_at TIMESTAMP
            );
            """;

    // ── 8. Демонстрація придушення відступів ─────────────────────────────────

    static void demonstrateIndentation() {
        // Закриваючий """ стоїть у стовпці 8 → саме стільки пробілів буде відкинуто
        String aligned = """
                line one
                line two
                line three
                """;

        // Закриваючий """ стоїть у стовпці 0 → відступи зберігаються повністю
        String withIndent = """
                line one
                line two
                line three
""";

        // Закриваючий """ зсунутий менше → залишається залишковий відступ
        String partialStrip = """
                line one
                line two
                line three
            """;  // 12 пробілів → відкидається 12, залишок = 4 пробіли на кожному рядку

        System.out.println("-- закриваючий \"\"\" у стовпці 16 (повне придушення) --");
        System.out.println(aligned);

        System.out.println("-- закриваючий \"\"\" у стовпці 0 (відступи збережено) --");
        System.out.println(withIndent);

        System.out.println("-- закриваючий \"\"\" у стовпці 12 (часткове придушення) --");
        System.out.println(partialStrip);

        // Перевірка через char-коди першого символу кожного варіанту
        System.out.printf("aligned    починається з '%c' (код %d)%n",
                aligned.charAt(0), (int) aligned.charAt(0));
        System.out.printf("withIndent починається з '%c' (код %d)%n",
                withIndent.charAt(0), (int) withIndent.charAt(0));
        System.out.printf("partialStrip починається з '%c' (код %d)%n",
                partialStrip.charAt(0), (int) partialStrip.charAt(0));
    }

    // ── 9. Інші способи керування відступами ─────────────────────────────────

    static void demonstrateIndentationMethods() {

        // stripIndent() — програмне придушення спільного відступу (як автоматика text block)
        String raw = "        line one\n" +
                     "        line two\n" +
                     "        line three\n";
        String stripped = raw.stripIndent();
        System.out.println("stripIndent() на звичайному рядку:");
        System.out.println(stripped);

        // indent(n) — додає або видаляє n пробілів на кожному рядку
        String base = """
                one
                two
                three
                """;
        System.out.println("indent(+4) — додає відступ:");
        System.out.print(base.indent(4));   // indent додає newline автоматично

        System.out.println("indent(-2) — прибирає 2 пробіли (тут їх нема, тож без змін):");
        System.out.print(base.indent(-2));

        // \ в кінці рядка — пригнічує перенос (рядки зливаються)
        String noNewline = """
                first \
                second \
                third
                """;
        System.out.println("Escape \\ — рядки без переносу:");
        System.out.println(noNewline);  // → "first second third"

        // \s — примусовий пробіл; запобігає видаленню trailing-пробілів
        String withTrailing = """
                "A"  \s
                "BB" \s
                "CCC"\s
                """;
        System.out.println("Escape \\s — збереження trailing-пробілів (вирівнювання):");
        System.out.println(withTrailing);
        System.out.println("Довжина першого рядка: " + withTrailing.lines().findFirst().orElse("").length());
    }

    // ── Demo ──────────────────────────────────────────────────────────────────

    public static void main(String[] args) {

        // JSON
        System.out.println("=== JSON ===");
        System.out.println(buildUserJson("Olha", 25, "olha@example.com"));

        // HTML
        System.out.println("=== HTML ===");
        System.out.println(buildHtmlPage(
                "Головна",
                "Ласкаво просимо!",
                "Це приклад HTML-сторінки, згенерованої за допомогою text block."
        ));

        // SQL
        System.out.println("=== SQL SELECT ===");
        System.out.println(buildSelectQuery("users", "role", "admin"));

        System.out.println("=== SQL INSERT ===");
        System.out.println(buildInsertQuery("Olha", 25, "olha@example.com"));

        System.out.println("=== SQL UPDATE ===");
        System.out.println(buildUpdateQuery("new@example.com", "moderator", 42));

        System.out.println("=== SQL JOIN ===");
        System.out.println(buildJoinQuery("admin"));

        System.out.println("=== SQL CREATE TABLE ===");
        System.out.println(CREATE_USERS_TABLE);

        // Придушення відступів
        System.out.println("=== Придушення відступів (позиція \"\"\") ===");
        demonstrateIndentation();

        System.out.println("=== Інші методи керування відступами ===");
        demonstrateIndentationMethods();

        // Порівняння: традиційний рядок vs text block
        System.out.println("=== Порівняння ===");

        // До Java 15
        String oldWay = "{\n" +
                        "  \"key\": \"value\"\n" +
                        "}";

        // Починаючи з Java 15
        String newWay = """
                {
                  "key": "value"
                }
                """;

        System.out.println("Результати однакові: " + oldWay.strip().equals(newWay.strip()));
    }
}
