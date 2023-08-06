// Função para adicionar a classe .active ao link do menu correto
function setActiveLink() {
  const currentPage = window.location.pathname // Obtém o caminho da página atual

  // Remove a classe .active de todos os links do menu
  const links = document.querySelectorAll(".navbar-nav li a")
  links.forEach((link) => {
    link.classList.remove("active")
  })

  // Adiciona a classe .active ao link correspondente à página atual
  if (currentPage.includes("index.html")) {
    document
      .querySelector('.navbar-nav li a[href="index.html"]')
      .classList.add("active")
  } else if (currentPage.includes("destinos.html")) {
    document
      .querySelector('.navbar-nav li a[href="destinos.html"]')
      .classList.add("active")
  } else if (currentPage.includes("promocoes.html")) {
    document
      .querySelector('.navbar-nav li a[href="promocoes.html"]')
      .classList.add("active")
  } else if (currentPage.includes("contato.html")) {
    document
      .querySelector('.navbar-nav li a[href="contato.html"]')
      .classList.add("active")
  }
}

// Chama a função para definir o link ativo na página carregada
setActiveLink()