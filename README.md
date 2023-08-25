# Библиотека Security

Нужно дополнительно инициализировать AuthenticationProvider. И настроить HttpSecurity, в который добавить
`  .authenticationProvider(authenticationProvider)
.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)`

При инициализации DaoAuthenticationProvider передать в качестве UserDetailsService класс implements UserDetailService

Самый простой способ для интеграции юзера системы и представления юзера для Spring Security - добавить в юзера системы статический метод по получению CustomUserDetails из него