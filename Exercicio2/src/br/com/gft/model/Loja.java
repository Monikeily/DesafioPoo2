package br.com.gft.model;


import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame>videoGames;
	
	public Loja() {
		super();
	}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
		
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
		
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if (livros.isEmpty()) {
			System.out.println("A loja não contém livros no seu estoque.");
		} else {
			System.out.println("A loja " + nome + " tem esses livros para venda: ");
			livros.forEach(livros -> {
				System.out.println("Título: " + livros.getNome() + ", preço " + livros.getPreco() + ", quantidade: " + livros.getQtd() + " no estoque.");
				});
		}
				
	}
	
	public void listaVideoGames() {
		if (videoGames.isEmpty()) {
			System.out.println("A loja Americanas não possui esses video-games para venda.");
		} else {
			System.out.println("A loja " + nome + " possui esses vídeogames para venda: ");
			videoGames.forEach(videoGames -> {
				System.out.println("Video-game: " + videoGames.getNome() + ", preço " + videoGames.getPreco() + ", quantidade: "
						+ videoGames.getQtd() + " para estoque.");
			});
		}
		
	}
	
	public double calculaPatrimonio() {
		
		double patrimonioTotal;

		patrimonioTotal = livros.stream().mapToDouble(livros -> (livros.getPreco()*livros.getQtd())).sum();
		patrimonioTotal += videoGames.stream().mapToDouble(videoGames -> (videoGames.getPreco()*videoGames.getQtd())).sum();
		System.out.println("O patrimonio da loja " + nome + " é de: R$ " + patrimonioTotal);
		return patrimonioTotal;
		
		
	}



}
	