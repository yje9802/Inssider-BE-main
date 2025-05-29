# docker/nginx/Dockerfile

FROM nginx:stable-alpine

# 기존 기본 설정 제거
# RUN rm /etc/nginx/conf.d/default.conf

# nginx.conf를 default.conf라는 이름으로 복사해 넣음
COPY nginx.conf /etc/nginx/conf.d/default.conf
RUN echo "✅ nginx.conf 복사됨:" && ls -l /etc/nginx/conf.d/