#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /src
COPY ["FibonacciApp/FibonacciApp.csproj", "FibonacciApp/"]
RUN dotnet restore "FibonacciApp/FibonacciApp.csproj"
COPY . .
WORKDIR "/src/FibonacciApp"
RUN dotnet build "FibonacciApp.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "FibonacciApp.csproj" -c Release -o /app/publish /p:UseAppHost=false

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "FibonacciApp.dll"]