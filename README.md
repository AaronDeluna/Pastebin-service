# PastebinService

PastebinService - это веб-приложение для создания, хранения и управления текстовыми заметками (пастами). Сервис позволяет пользователям сохранять текстовые данные, делиться ими с другими и управлять своими заметками.

## Основной функционал

- Создание и хранение заметок (паст).
- Просмотр заметок по уникальному URL.
- Возможность установки срока действия заметки.
- Регистрация и авторизация пользователей.
- Управление профилем пользователя.
- Поиск заметок по содержимому и заголовку.
- Возможность сделать заметку публичной или приватной.
- Поддержка различных форматов текста (Markdown, HTML и т.д.).
- Подсветка синтаксиса для кода.
- API для интеграции с другими сервисами и приложениями.

## Установка

### Требования

- Java 11 или выше
- Maven 3.6 или выше
- PostgreSQL (или другая совместимая база данных)

### Шаги установки

1. Клонируйте репозиторий:
    ```sh
    git clone https://github.com/username/PastebinService.git
    cd PastebinService
    ```

2. Настройте базу данных:
    - Создайте новую базу данных PostgreSQL.
    - Настройте подключение к базе данных в файле `application.properties`:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/pastebinservice
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      ```

3. Соберите и запустите приложение:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

Приложение будет доступно по адресу `http://localhost:8080`.

## Использование

### API

#### Создание заметки

```http
POST /api/pastes
Content-Type: application/json

{
  "title": "My Paste",
  "content": "This is the content of the paste.",
  "expiryDate": "2024-12-31T23:59:59",
  "isPublic": true,
  "authorId": 1
}

Получение заметки по URL

GET /api/pastes/{url}

Регистрация пользователя

POST /api/users/register
Content-Type: application/json

{
  "username": "newuser",
  "email": "newuser@example.com",
  "password": "password"
}

Авторизация пользователя

POST /api/users/login
Content-Type: application/json

{
  "email": "newuser@example.com",
  "password": "password"
}

```

### Дополнительная информация

Поддержка комментариев: Пользователи могут оставлять комментарии к публичным заметкам.
Уведомления: Уведомления о новых комментариях и действиях с заметками.
Аналитика: Статистика по просмотрам и истории изменений заметок.
Вклад

Если вы хотите внести вклад в развитие проекта, пожалуйста, создайте форк репозитория и отправьте Pull Request.

